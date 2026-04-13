package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HomePerson20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HomePerson20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.998f, 2.388f)
            curveToRelative(0.57f, -0.512f, 1.434f, -0.512f, 2.005f, 0f)
            lineToRelative(5.5f, 4.942f)
            curveTo(16.819f, 7.614f, 17f, 8.02f, 17f, 8.445f)
            verticalLineToRelative(0.956f)
            curveToRelative(-0.441f, -0.255f, -0.954f, -0.402f, -1.5f, -0.402f)
            curveToRelative(-1.306f, 0f, -2.418f, 0.835f, -2.83f, 2f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 11f, 8f, 11.224f, 8f, 11.5f)
            verticalLineToRelative(4f)
            curveTo(8f, 16.329f, 7.328f, 17f, 6.5f, 17f)
            horizontalLineToRelative(-2f)
            curveTo(3.672f, 17f, 3f, 16.329f, 3f, 15.5f)
            verticalLineTo(8.446f)
            curveTo(3f, 8.02f, 3.18f, 7.615f, 3.498f, 7.33f)
            lineToRelative(5.5f, -4.942f)
            close()
            moveTo(17.5f, 12f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            curveToRelative(0f, -1.104f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.896f, 2f, 2f)
            close()
            moveToRelative(1.5f, 4.5f)
            curveToRelative(0f, 1.246f, -1f, 2.5f, -3.5f, 2.5f)
            reflectiveCurveTo(12f, 17.75f, 12f, 16.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
