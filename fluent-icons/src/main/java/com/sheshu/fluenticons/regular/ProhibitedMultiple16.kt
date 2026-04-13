package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ProhibitedMultiple16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ProhibitedMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.465f, 3.465f)
            curveToRelative(1.833f, -1.834f, 4.736f, -1.946f, 6.7f, -0.337f)
            lineToRelative(-7.037f, 7.037f)
            curveTo(1.52f, 8.2f, 1.631f, 5.298f, 3.465f, 3.465f)
            close()
            moveToRelative(0.37f, 7.407f)
            lineToRelative(7.037f, -7.037f)
            curveToRelative(1.609f, 1.965f, 1.497f, 4.867f, -0.336f, 6.7f)
            curveToRelative(-1.834f, 1.834f, -4.736f, 1.946f, -6.7f, 0.337f)
            close()
            moveToRelative(7.408f, -8.115f)
            curveToRelative(-2.344f, -2.343f, -6.143f, -2.343f, -8.486f, 0f)
            curveToRelative(-2.343f, 2.344f, -2.343f, 6.142f, 0f, 8.486f)
            curveToRelative(2.344f, 2.343f, 6.142f, 2.343f, 8.486f, 0f)
            curveToRelative(2.343f, -2.344f, 2.343f, -6.143f, 0f, -8.486f)
            close()
            moveTo(14f, 7f)
            curveToRelative(0f, 1.217f, -0.31f, 2.361f, -0.857f, 3.358f)
            curveToRelative(-0.507f, 1.267f, -1.518f, 2.278f, -2.785f, 2.785f)
            curveTo(9.361f, 13.69f, 8.217f, 14f, 7f, 14f)
            curveToRelative(-0.369f, 0f, -0.73f, -0.029f, -1.084f, -0.084f)
            curveTo(6.698f, 14.29f, 7.575f, 14.5f, 8.5f, 14.5f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            curveToRelative(0f, -0.925f, -0.21f, -1.802f, -0.583f, -2.584f)
            curveTo(13.972f, 6.269f, 14f, 6.63f, 14f, 7f)
            close()
        }
    }.build()
}
