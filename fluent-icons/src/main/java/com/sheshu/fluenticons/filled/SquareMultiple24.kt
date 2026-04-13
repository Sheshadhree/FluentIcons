package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.518f, 5f)
            horizontalLineTo(6.009f)
            curveToRelative(0.128f, -1.678f, 1.53f, -3f, 3.24f, -3f)
            horizontalLineToRelative(8.001f)
            curveTo(19.873f, 2f, 22f, 4.127f, 22f, 6.75f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.71f, -1.322f, 3.113f, -3f, 3.24f)
            verticalLineToRelative(-1.508f)
            curveToRelative(0.848f, -0.121f, 1.5f, -0.85f, 1.5f, -1.732f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            horizontalLineToRelative(-8f)
            curveTo(8.368f, 3.5f, 7.639f, 4.152f, 7.518f, 5f)
            close()
            moveTo(5.25f, 6f)
            curveTo(3.455f, 6f, 2f, 7.455f, 2f, 9.25f)
            verticalLineToRelative(9.5f)
            curveTo(2f, 20.545f, 3.455f, 22f, 5.25f, 22f)
            horizontalLineToRelative(9.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-9.5f)
            curveTo(18f, 7.455f, 16.545f, 6f, 14.75f, 6f)
            horizontalLineToRelative(-9.5f)
            close()
        }
    }.build()
}
