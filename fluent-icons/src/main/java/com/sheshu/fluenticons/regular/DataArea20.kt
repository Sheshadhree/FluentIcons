package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DataArea20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataArea20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 2f)
            curveTo(2.776f, 2f, 3f, 2.224f, 3f, 2.5f)
            verticalLineToRelative(6.23f)
            lineToRelative(3.797f, -1.687f)
            curveTo(6.942f, 6.98f, 7.11f, 6.987f, 7.248f, 7.066f)
            lineToRelative(3.205f, 1.831f)
            lineToRelative(4.735f, -3.787f)
            curveToRelative(0.15f, -0.12f, 0.355f, -0.144f, 0.529f, -0.06f)
            curveTo(15.89f, 5.132f, 16f, 5.307f, 16f, 5.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(17.776f, 18f, 17.5f, 18f)
            horizontalLineToRelative(-13f)
            curveTo(3.12f, 18f, 2f, 16.88f, 2f, 15.5f)
            verticalLineToRelative(-13f)
            curveTo(2f, 2.224f, 2.224f, 2f, 2.5f, 2f)
            close()
            moveTo(15f, 17f)
            verticalLineTo(6.54f)
            lineToRelative(-4.188f, 3.35f)
            curveToRelative(-0.16f, 0.129f, -0.382f, 0.146f, -0.56f, 0.044f)
            lineTo(6.972f, 8.06f)
            lineTo(3f, 9.825f)
            verticalLineTo(15.5f)
            curveTo(3f, 16.328f, 3.672f, 17f, 4.5f, 17f)
            horizontalLineTo(15f)
            close()
        }
    }.build()
}
