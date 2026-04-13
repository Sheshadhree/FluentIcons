package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoClipMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoClipMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 3f)
            curveTo(3.12f, 3f, 2f, 4.12f, 2f, 5.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 13.88f, 3.12f, 15f, 4.5f, 15f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(16f, 4.12f, 14.88f, 3f, 13.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(7f, 6.756f)
            curveToRelative(0f, -0.602f, 0.673f, -0.959f, 1.171f, -0.62f)
            lineToRelative(3.61f, 2.451f)
            curveToRelative(0.293f, 0.198f, 0.293f, 0.629f, 0.001f, 0.827f)
            lineToRelative(-3.61f, 2.458f)
            curveTo(7.674f, 12.211f, 7f, 11.854f, 7f, 11.252f)
            verticalLineTo(6.756f)
            close()
            moveTo(6.5f, 17f)
            curveToRelative(-0.818f, 0f, -1.544f, -0.393f, -2f, -1f)
            horizontalLineTo(14f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(5.5f)
            curveToRelative(0.607f, 0.456f, 1f, 1.182f, 1f, 2f)
            verticalLineTo(13f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineTo(6.5f)
            close()
        }
    }.build()
}
