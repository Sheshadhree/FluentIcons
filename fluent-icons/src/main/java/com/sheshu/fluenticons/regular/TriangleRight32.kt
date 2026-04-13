package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleRight32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(27.318f, 13.153f)
            curveToRelative(2.241f, 1.236f, 2.24f, 4.458f, -0.001f, 5.693f)
            lineTo(7.818f, 29.588f)
            curveTo(5.652f, 30.782f, 3f, 29.215f, 3f, 26.742f)
            verticalLineTo(5.25f)
            curveToRelative(0f, -2.474f, 2.653f, -4.04f, 4.82f, -2.846f)
            lineToRelative(19.498f, 10.75f)
            close()
            moveToRelative(-0.966f, 3.941f)
            curveToRelative(0.862f, -0.475f, 0.862f, -1.714f, 0f, -2.19f)
            lineTo(6.854f, 4.156f)
            curveTo(6.02f, 3.695f, 5f, 4.298f, 5f, 5.25f)
            verticalLineToRelative(21.492f)
            curveToRelative(0f, 0.95f, 1.02f, 1.553f, 1.853f, 1.095f)
            lineToRelative(19.499f, -10.743f)
            close()
        }
    }.build()
}
