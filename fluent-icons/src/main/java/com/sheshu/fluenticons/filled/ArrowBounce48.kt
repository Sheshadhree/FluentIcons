package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowBounce48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowBounce48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 14.5f)
            curveTo(4f, 13.672f, 4.672f, 13f, 5.5f, 13f)
            horizontalLineToRelative(15f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(21.328f, 16f, 20.5f, 16f)
            horizontalLineTo(9.189f)
            lineToRelative(15.813f, 15.407f)
            lineToRelative(16.453f, -15.983f)
            curveToRelative(0.594f, -0.577f, 1.544f, -0.563f, 2.12f, 0.03f)
            curveToRelative(0.578f, 0.595f, 0.564f, 1.545f, -0.03f, 2.122f)
            lineToRelative(-17.5f, 17f)
            curveToRelative(-0.583f, 0.566f, -1.51f, 0.565f, -2.092f, -0.002f)
            lineTo(7f, 18.056f)
            verticalLineTo(29.5f)
            curveTo(7f, 30.328f, 6.328f, 31f, 5.5f, 31f)
            reflectiveCurveTo(4f, 30.328f, 4f, 29.5f)
            verticalLineToRelative(-15f)
            close()
        }
    }.build()
}
