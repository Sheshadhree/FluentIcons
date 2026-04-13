package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Copy32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Copy32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 5.25f)
            curveTo(8.5f, 3.455f, 9.955f, 2f, 11.75f, 2f)
            horizontalLineToRelative(12f)
            curveTo(25.545f, 2f, 27f, 3.455f, 27f, 5.25f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-12f)
            curveToRelative(-1.795f, 0f, -3.25f, -1.455f, -3.25f, -3.25f)
            verticalLineToRelative(-18f)
            close()
            moveTo(5f, 8.75f)
            curveToRelative(0f, -1.352f, 0.825f, -2.511f, 2f, -3.001f)
            verticalLineToRelative(17.75f)
            curveToRelative(0f, 2.486f, 2.015f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(11.751f)
            curveToRelative(-0.49f, 1.175f, -1.649f, 2f, -3.001f, 2f)
            horizontalLineTo(11.5f)
            curveTo(7.91f, 30f, 5f, 27.09f, 5f, 23.5f)
            verticalLineTo(8.75f)
            close()
        }
    }.build()
}
