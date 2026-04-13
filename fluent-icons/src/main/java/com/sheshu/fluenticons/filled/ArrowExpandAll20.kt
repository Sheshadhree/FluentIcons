package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowExpandAll20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowExpandAll20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.75f)
            curveTo(2f, 4.336f, 2.336f, 4f, 2.75f, 4f)
            horizontalLineToRelative(14.5f)
            curveTo(17.664f, 4f, 18f, 4.336f, 18f, 4.75f)
            reflectiveCurveTo(17.664f, 5.5f, 17.25f, 5.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 5.5f, 2f, 5.164f, 2f, 4.75f)
            close()
            moveToRelative(8f, 3f)
            curveTo(10f, 7.336f, 10.336f, 7f, 10.75f, 7f)
            horizontalLineToRelative(6.5f)
            curveTo(17.664f, 7f, 18f, 7.336f, 18f, 7.75f)
            reflectiveCurveTo(17.664f, 8.5f, 17.25f, 8.5f)
            horizontalLineToRelative(-6.5f)
            curveTo(10.336f, 8.5f, 10f, 8.164f, 10f, 7.75f)
            close()
            moveToRelative(-1.22f, 5.53f)
            lineToRelative(-2.5f, 2.5f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-2.5f, -2.5f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineTo(5f, 13.44f)
            verticalLineTo(7.75f)
            curveTo(5f, 7.336f, 5.336f, 7f, 5.75f, 7f)
            reflectiveCurveTo(6.5f, 7.336f, 6.5f, 7.75f)
            verticalLineToRelative(5.69f)
            lineToRelative(1.22f, -1.22f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            close()
        }
    }.build()
}
