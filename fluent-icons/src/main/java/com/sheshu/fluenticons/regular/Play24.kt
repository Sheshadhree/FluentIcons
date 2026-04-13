package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Play24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Play24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.609f, 4.615f)
            curveTo(7.109f, 4.343f, 6.5f, 4.705f, 6.5f, 5.274f)
            verticalLineToRelative(13.452f)
            curveToRelative(0f, 0.569f, 0.609f, 0.93f, 1.109f, 0.659f)
            lineToRelative(12.361f, -6.726f)
            curveToRelative(0.522f, -0.284f, 0.522f, -1.034f, 0f, -1.318f)
            lineTo(7.609f, 4.615f)
            close()
            moveTo(5f, 5.274f)
            curveToRelative(0f, -1.707f, 1.826f, -2.792f, 3.325f, -1.977f)
            lineToRelative(12.362f, 6.726f)
            curveToRelative(1.566f, 0.853f, 1.566f, 3.101f, 0f, 3.953f)
            lineTo(8.325f, 20.702f)
            curveTo(6.826f, 21.518f, 5f, 20.432f, 5f, 18.726f)
            verticalLineTo(5.274f)
            close()
        }
    }.build()
}
