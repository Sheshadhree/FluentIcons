package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DividerTall16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DividerTall16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.75f, 1f)
            curveTo(8.164f, 1f, 8.5f, 1.336f, 8.5f, 1.75f)
            verticalLineToRelative(12.5f)
            curveTo(8.5f, 14.664f, 8.164f, 15f, 7.75f, 15f)
            reflectiveCurveTo(7f, 14.664f, 7f, 14.25f)
            verticalLineTo(1.75f)
            curveTo(7f, 1.336f, 7.336f, 1f, 7.75f, 1f)
            close()
        }
    }.build()
}
