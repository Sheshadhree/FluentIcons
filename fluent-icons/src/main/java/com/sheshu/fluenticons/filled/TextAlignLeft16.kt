package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextAlignLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextAlignLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 3.75f)
            curveTo(1f, 3.336f, 1.336f, 3f, 1.75f, 3f)
            horizontalLineToRelative(8.5f)
            curveTo(10.664f, 3f, 11f, 3.336f, 11f, 3.75f)
            reflectiveCurveTo(10.664f, 4.5f, 10.25f, 4.5f)
            horizontalLineToRelative(-8.5f)
            curveTo(1.336f, 4.5f, 1f, 4.164f, 1f, 3.75f)
            close()
            moveToRelative(0f, 4f)
            curveTo(1f, 7.336f, 1.336f, 7f, 1.75f, 7f)
            horizontalLineToRelative(12.5f)
            curveTo(14.664f, 7f, 15f, 7.336f, 15f, 7.75f)
            reflectiveCurveTo(14.664f, 8.5f, 14.25f, 8.5f)
            horizontalLineTo(1.75f)
            curveTo(1.336f, 8.5f, 1f, 8.164f, 1f, 7.75f)
            close()
            moveToRelative(0f, 4f)
            curveTo(1f, 11.336f, 1.336f, 11f, 1.75f, 11f)
            horizontalLineToRelative(4.5f)
            curveTo(6.664f, 11f, 7f, 11.336f, 7f, 11.75f)
            reflectiveCurveTo(6.664f, 12.5f, 6.25f, 12.5f)
            horizontalLineToRelative(-4.5f)
            curveTo(1.336f, 12.5f, 1f, 12.164f, 1f, 11.75f)
            close()
        }
    }.build()
}
