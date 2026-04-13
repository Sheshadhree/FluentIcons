package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ServiceBell16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ServiceBell16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1.5f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(0.341f)
            curveTo(3.67f, 4.665f, 2f, 6.888f, 2f, 9.5f)
            curveTo(2f, 9.776f, 2.224f, 10f, 2.5f, 10f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            curveToRelative(0f, -2.612f, -1.67f, -4.835f, -4f, -5.659f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
            moveTo(7.5f, 6f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            curveToRelative(1.36f, 0f, 2.56f, 0.679f, 3.283f, 1.714f)
            curveToRelative(0.158f, 0.226f, 0.102f, 0.538f, -0.124f, 0.696f)
            curveToRelative(-0.227f, 0.158f, -0.539f, 0.102f, -0.696f, -0.124f)
            curveTo(9.92f, 7.008f, 9.019f, 6.5f, 8f, 6.5f)
            curveTo(7.724f, 6.5f, 7.5f, 6.276f, 7.5f, 6f)
            close()
            moveToRelative(-5f, 5f)
            curveTo(1.672f, 11f, 1f, 11.672f, 1f, 12.5f)
            reflectiveCurveTo(1.672f, 14f, 2.5f, 14f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(14.328f, 11f, 13.5f, 11f)
            horizontalLineToRelative(-11f)
            close()
        }
    }.build()
}
