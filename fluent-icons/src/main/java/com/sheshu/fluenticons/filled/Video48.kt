package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Video48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Video48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 16.25f)
            curveTo(4f, 12.798f, 6.798f, 10f, 10.25f, 10f)
            horizontalLineToRelative(14.5f)
            curveToRelative(3.452f, 0f, 6.25f, 2.798f, 6.25f, 6.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-14.5f)
            curveTo(6.798f, 38f, 4f, 35.202f, 4f, 31.75f)
            verticalLineToRelative(-15.5f)
            close()
            moveToRelative(34.907f, 19.168f)
            lineTo(33f, 31.339f)
            verticalLineToRelative(-14.68f)
            lineToRelative(5.907f, -4.078f)
            curveToRelative(2.156f, -1.488f, 5.097f, 0.055f, 5.097f, 2.675f)
            verticalLineToRelative(17.487f)
            curveToRelative(0f, 2.62f, -2.941f, 4.163f, -5.097f, 2.675f)
            close()
        }
    }.build()
}
