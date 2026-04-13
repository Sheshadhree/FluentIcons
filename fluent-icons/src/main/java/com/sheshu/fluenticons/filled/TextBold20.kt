package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextBold20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextBold20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4.5f)
            curveTo(5f, 3.672f, 5.672f, 3f, 6.5f, 3f)
            horizontalLineToRelative(3.88f)
            curveToRelative(2.364f, 0f, 4.12f, 1.934f, 4.12f, 4.12f)
            curveToRelative(0f, 0.819f, -0.247f, 1.606f, -0.68f, 2.269f)
            curveToRelative(0.842f, 0.749f, 1.427f, 1.849f, 1.427f, 3.241f)
            curveToRelative(0f, 2.775f, -2.318f, 4.37f, -4.367f, 4.37f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 17f, 5f, 16.328f, 5f, 15.5f)
            verticalLineToRelative(-11f)
            close()
            moveTo(8f, 6f)
            verticalLineToRelative(2.25f)
            horizontalLineToRelative(2.38f)
            curveToRelative(0.625f, 0f, 1.12f, -0.516f, 1.12f, -1.13f)
            curveTo(11.5f, 6.514f, 11.012f, 6f, 10.38f, 6f)
            horizontalLineTo(8f)
            close()
            moveToRelative(0f, 5.25f)
            verticalLineTo(14f)
            horizontalLineToRelative(2.88f)
            curveToRelative(0.691f, 0f, 1.367f, -0.537f, 1.367f, -1.37f)
            curveToRelative(0f, -0.84f, -0.684f, -1.38f, -1.367f, -1.38f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}
