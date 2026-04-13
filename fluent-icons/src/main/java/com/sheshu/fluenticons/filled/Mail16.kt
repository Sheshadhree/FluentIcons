package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Mail16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mail16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3f)
            curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
            verticalLineToRelative(0.201f)
            lineToRelative(6f, 3.231f)
            lineToRelative(6f, -3.23f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            close()
            moveToRelative(10f, 3.337f)
            lineTo(8.237f, 9.44f)
            curveToRelative(-0.148f, 0.08f, -0.326f, 0.08f, -0.474f, 0f)
            lineTo(2f, 6.337f)
            verticalLineTo(11f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6.337f)
            close()
        }
    }.build()
}
