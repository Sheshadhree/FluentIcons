package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareMultiple48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareMultiple48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.495f, 10f)
            horizontalLineToRelative(-2.503f)
            curveToRelative(0.131f, -3.336f, 2.877f, -6f, 6.245f, -6f)
            horizontalLineToRelative(14.5f)
            curveToRelative(5.109f, 0f, 9.25f, 4.141f, 9.25f, 9.25f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 3.364f, -2.658f, 6.108f, -5.989f, 6.245f)
            verticalLineTo(31.49f)
            curveToRelative(1.95f, -0.134f, 3.49f, -1.758f, 3.49f, -3.741f)
            verticalLineToRelative(-14.5f)
            curveToRelative(0f, -3.728f, -3.023f, -6.75f, -6.75f, -6.75f)
            horizontalLineToRelative(-14.5f)
            curveToRelative(-1.988f, 0f, -3.614f, 1.546f, -3.742f, 3.5f)
            close()
            moveTo(4f, 18.25f)
            curveTo(4f, 14.798f, 6.798f, 12f, 10.25f, 12f)
            horizontalLineToRelative(19.5f)
            curveToRelative(3.452f, 0f, 6.25f, 2.798f, 6.25f, 6.25f)
            verticalLineToRelative(19.5f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-19.5f)
            curveTo(6.798f, 44f, 4f, 41.202f, 4f, 37.75f)
            verticalLineToRelative(-19.5f)
            close()
        }
    }.build()
}
