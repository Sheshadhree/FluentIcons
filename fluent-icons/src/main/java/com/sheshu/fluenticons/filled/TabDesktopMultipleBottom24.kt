package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabDesktopMultipleBottom24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabDesktopMultipleBottom24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.008f, 5f)
            curveToRelative(0.128f, -1.678f, 1.53f, -3f, 3.24f, -3f)
            horizontalLineToRelative(8.002f)
            curveTo(19.873f, 2f, 22f, 4.127f, 22f, 6.75f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.71f, -1.322f, 3.113f, -3f, 3.24f)
            horizontalLineToRelative(-0.002f)
            verticalLineTo(9.25f)
            curveToRelative(0f, -2.347f, -1.902f, -4.25f, -4.25f, -4.25f)
            horizontalLineToRelative(-8.74f)
            close()
            moveTo(5.25f, 6f)
            curveTo(3.455f, 6f, 2f, 7.455f, 2f, 9.25f)
            verticalLineToRelative(7.25f)
            horizontalLineToRelative(7.25f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineTo(22f)
            horizontalLineToRelative(3.25f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-9.5f)
            curveTo(18f, 7.455f, 16.545f, 6f, 14.75f, 6f)
            horizontalLineToRelative(-9.5f)
            close()
            moveTo(2f, 18.75f)
            verticalLineTo(18f)
            horizontalLineToRelative(7.25f)
            curveTo(9.664f, 18f, 10f, 18.336f, 10f, 18.75f)
            verticalLineTo(22f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 22f, 2f, 20.545f, 2f, 18.75f)
            close()
        }
    }.build()
}
