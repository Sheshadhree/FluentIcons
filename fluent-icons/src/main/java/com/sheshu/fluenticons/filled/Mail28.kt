package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Mail28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mail28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.004f, 7.75f)
            curveTo(2.004f, 5.679f, 3.683f, 4f, 5.754f, 4f)
            horizontalLineTo(22.25f)
            curveTo(24.32f, 4f, 26f, 5.679f, 26f, 7.75f)
            verticalLineToRelative(0.01f)
            lineToRelative(-12f, 6.148f)
            lineTo(2.004f, 7.764f)
            verticalLineTo(7.75f)
            close()
            moveToRelative(0f, 1.699f)
            verticalLineToRelative(9.801f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineTo(22.25f)
            curveToRelative(2.07f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(9.446f)
            lineToRelative(-11.66f, 5.972f)
            curveToRelative(-0.214f, 0.11f, -0.469f, 0.11f, -0.683f, 0f)
            lineTo(2.004f, 9.449f)
            close()
        }
    }.build()
}
