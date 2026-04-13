package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CircleLine24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleLine24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.972f, 12.75f)
            horizontalLineTo(2.027f)
            curveTo(2.411f, 17.922f, 6.73f, 22f, 12f, 22f)
            curveToRelative(5.27f, 0f, 9.588f, -4.078f, 9.972f, -9.25f)
            close()
            moveToRelative(0f, -1.5f)
            horizontalLineTo(2.027f)
            curveTo(2.411f, 6.077f, 6.73f, 2f, 12f, 2f)
            curveToRelative(5.27f, 0f, 9.588f, 4.077f, 9.972f, 9.25f)
            close()
        }
    }.build()
}
