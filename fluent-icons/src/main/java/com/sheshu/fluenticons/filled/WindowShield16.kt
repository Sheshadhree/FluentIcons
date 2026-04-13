package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WindowShield16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WindowShield16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(3.007f)
            curveToRelative(-0.373f, -0.171f, -0.714f, -0.414f, -1f, -0.661f)
            verticalLineTo(6f)
            horizontalLineTo(3f)
            verticalLineToRelative(5.5f)
            curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineToRelative(2.691f)
            curveToRelative(0.098f, 0.362f, 0.23f, 0.695f, 0.385f, 1f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveToRelative(9.88f, 2.66f)
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
