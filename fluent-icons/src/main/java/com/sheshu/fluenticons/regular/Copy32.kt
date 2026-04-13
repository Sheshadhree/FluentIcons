package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Copy32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Copy32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.75f, 2f)
            curveTo(9.955f, 2f, 8.5f, 3.455f, 8.5f, 5.25f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(12f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-18f)
            curveTo(27f, 3.455f, 25.545f, 2f, 23.75f, 2f)
            horizontalLineToRelative(-12f)
            close()
            moveTo(10.5f, 5.25f)
            curveTo(10.5f, 4.56f, 11.06f, 4f, 11.75f, 4f)
            horizontalLineToRelative(12f)
            curveTo(24.44f, 4f, 25f, 4.56f, 25f, 5.25f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-12f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineToRelative(-18f)
            close()
            moveTo(7f, 5.749f)
            curveToRelative(-1.175f, 0.49f, -2f, 1.649f, -2f, 3f)
            verticalLineTo(23.5f)
            curveToRelative(0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
            horizontalLineToRelative(8.75f)
            curveToRelative(1.352f, 0f, 2.511f, -0.825f, 3.001f, -2f)
            horizontalLineTo(11.5f)
            curveTo(9.015f, 28f, 7f, 25.986f, 7f, 23.5f)
            verticalLineTo(5.75f)
            close()
        }
    }.build()
}
