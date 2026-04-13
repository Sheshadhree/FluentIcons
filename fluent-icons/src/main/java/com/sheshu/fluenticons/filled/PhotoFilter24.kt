package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhotoFilter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhotoFilter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 2f)
            curveToRelative(3.384f, 0f, 6.245f, 2.242f, 7.179f, 5.321f)
            curveTo(19.759f, 8.255f, 22f, 11.116f, 22f, 14.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-3.384f, 0f, -6.245f, -2.242f, -7.179f, -5.321f)
            curveTo(4.241f, 15.745f, 2f, 12.884f, 2f, 9.5f)
            curveTo(2f, 5.358f, 5.358f, 2f, 9.5f, 2f)
            close()
            moveToRelative(7.498f, 7.599f)
            lineTo(17f, 9.5f)
            curveToRelative(0f, 4.109f, -3.304f, 7.446f, -7.4f, 7.5f)
            curveToRelative(0.909f, 1.78f, 2.762f, 3f, 4.9f, 3f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            curveToRelative(0f, -2.138f, -1.22f, -3.991f, -3.002f, -4.901f)
            close()
            moveTo(9.5f, 4f)
            curveTo(6.462f, 4f, 4f, 6.462f, 4f, 9.5f)
            curveToRelative(0f, 2.138f, 1.22f, 3.991f, 3.002f, 4.901f)
            lineTo(7f, 14.5f)
            curveToRelative(0f, -4.109f, 3.304f, -7.446f, 7.4f, -7.5f)
            curveToRelative(-0.909f, -1.78f, -2.762f, -3f, -4.9f, -3f)
            close()
        }
    }.build()
}
