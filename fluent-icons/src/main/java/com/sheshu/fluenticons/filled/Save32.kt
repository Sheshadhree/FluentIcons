package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Save32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Save32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 12f)
            curveTo(10.12f, 12f, 9f, 10.88f, 9f, 9.5f)
            verticalLineTo(3f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 2.316f, 1.75f, 4.224f, 4f, 4.473f)
            verticalLineTo(18.5f)
            curveTo(7f, 17.12f, 8.12f, 16f, 9.5f, 16f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(10.473f)
            curveToRelative(2.25f, -0.25f, 4f, -2.157f, 4f, -4.473f)
            verticalLineTo(10.45f)
            curveToRelative(0f, -1.194f, -0.474f, -2.338f, -1.318f, -3.182f)
            lineToRelative(-2.95f, -2.95f)
            curveTo(23.995f, 3.581f, 23.028f, 3.126f, 22f, 3.023f)
            verticalLineTo(9.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-8f)
            close()
            moveTo(20f, 3f)
            horizontalLineToRelative(-9f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(8f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(3f)
            close()
            moveToRelative(3f, 26f)
            horizontalLineTo(9f)
            verticalLineTo(18.5f)
            curveTo(9f, 18.224f, 9.224f, 18f, 9.5f, 18f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(29f)
            close()
        }
    }.build()
}
