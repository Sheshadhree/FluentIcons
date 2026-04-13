package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareMultiple28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareMultiple28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.066f, 5f)
            horizontalLineTo(8.62f)
            curveToRelative(0.31f, -0.874f, 1.143f, -1.5f, 2.122f, -1.5f)
            horizontalLineToRelative(9.5f)
            curveToRelative(2.348f, 0f, 4.25f, 1.903f, 4.25f, 4.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.976f, -0.62f, 1.807f, -1.49f, 2.118f)
            verticalLineToRelative(1.555f)
            curveToRelative(1.707f, -0.351f, 2.99f, -1.862f, 2.99f, -3.673f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -3.176f, -2.574f, -5.75f, -5.75f, -5.75f)
            horizontalLineToRelative(-9.5f)
            curveTo(8.927f, 2f, 7.414f, 3.288f, 7.066f, 5f)
            close()
            moveTo(5.75f, 6f)
            curveTo(3.679f, 6f, 2f, 7.679f, 2f, 9.75f)
            verticalLineToRelative(12.5f)
            curveTo(2f, 24.321f, 3.679f, 26f, 5.75f, 26f)
            horizontalLineToRelative(12.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(9.75f)
            curveTo(22f, 7.679f, 20.321f, 6f, 18.25f, 6f)
            horizontalLineTo(5.75f)
            close()
        }
    }.build()
}
