package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowExit16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowExit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.25f, 1.5f)
            curveTo(2.731f, 1.5f, 1.5f, 2.731f, 1.5f, 4.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            horizontalLineToRelative(6f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(10.664f, 13f, 10.25f, 13f)
            horizontalLineToRelative(-6f)
            curveTo(3.56f, 13f, 3f, 12.44f, 3f, 11.75f)
            verticalLineToRelative(-7.5f)
            curveTo(3f, 3.56f, 3.56f, 3f, 4.25f, 3f)
            horizontalLineToRelative(6f)
            curveTo(10.664f, 3f, 11f, 2.664f, 11f, 2.25f)
            reflectiveCurveTo(10.664f, 1.5f, 10.25f, 1.5f)
            horizontalLineToRelative(-6f)
            close()
            moveToRelative(7.78f, 3.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(1.47f, 1.47f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 7.25f, 6f, 7.586f, 6f, 8f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(5.69f)
            lineToRelative(-1.47f, 1.47f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(2.75f, -2.75f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-2.75f, -2.75f)
            close()
        }
    }.build()
}
