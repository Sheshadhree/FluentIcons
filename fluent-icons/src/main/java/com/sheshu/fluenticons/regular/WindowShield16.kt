package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.WindowShield16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.WindowShield16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(3.076f)
            curveToRelative(-0.155f, -0.305f, -0.287f, -0.638f, -0.385f, -1f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(0.846f)
            curveToRelative(0.286f, 0.247f, 0.627f, 0.49f, 1f, 0.66f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(13f, 5f)
            horizontalLineTo(3f)
            verticalLineTo(4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineTo(5f)
            close()
            moveToRelative(-1.12f, 2.16f)
            curveToRelative(0.508f, 0.532f, 1.484f, 1.379f, 2.684f, 1.552f)
            curveTo(14.803f, 8.747f, 15f, 8.946f, 15f, 9.194f)
            verticalLineToRelative(2.323f)
            curveToRelative(0f, 3.122f, -2.784f, 4.255f, -3.386f, 4.463f)
            curveToRelative(-0.075f, 0.026f, -0.152f, 0.026f, -0.228f, 0f)
            curveTo(10.785f, 15.772f, 8f, 14.64f, 8f, 11.517f)
            verticalLineTo(9.194f)
            curveToRelative(0f, -0.248f, 0.197f, -0.447f, 0.436f, -0.482f)
            curveToRelative(1.2f, -0.173f, 2.175f, -1.02f, 2.683f, -1.553f)
            curveToRelative(0.202f, -0.212f, 0.56f, -0.212f, 0.762f, 0f)
            close()
        }
    }.build()
}
