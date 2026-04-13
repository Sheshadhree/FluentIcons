package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowExit12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowExit12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 3.75f)
            curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
            horizontalLineToRelative(3f)
            curveTo(7.164f, 3f, 7.5f, 2.664f, 7.5f, 2.25f)
            reflectiveCurveTo(7.164f, 1.5f, 6.75f, 1.5f)
            horizontalLineToRelative(-3f)
            curveTo(2.507f, 1.5f, 1.5f, 2.507f, 1.5f, 3.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(3f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(7.164f, 9f, 6.75f, 9f)
            horizontalLineToRelative(-3f)
            curveTo(3.336f, 9f, 3f, 8.664f, 3f, 8.25f)
            verticalLineToRelative(-4.5f)
            close()
            moveToRelative(5.78f, -0.28f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(0.72f, 0.72f)
            horizontalLineTo(5.25f)
            curveTo(4.836f, 5.25f, 4.5f, 5.586f, 4.5f, 6f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.19f)
            lineTo(7.72f, 7.47f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-2f, -2f)
            close()
        }
    }.build()
}
