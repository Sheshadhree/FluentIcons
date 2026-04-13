package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DividerShort16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DividerShort16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.75f, 3f)
            curveTo(8.164f, 3f, 8.5f, 3.336f, 8.5f, 3.75f)
            verticalLineToRelative(8.5f)
            curveTo(8.5f, 12.664f, 8.164f, 13f, 7.75f, 13f)
            reflectiveCurveTo(7f, 12.664f, 7f, 12.25f)
            verticalLineToRelative(-8.5f)
            curveTo(7f, 3.336f, 7.336f, 3f, 7.75f, 3f)
            close()
        }
    }.build()
}
