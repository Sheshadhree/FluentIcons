package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Comma20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Comma20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 7.5f)
            curveTo(13.5f, 5.567f, 11.933f, 4f, 10f, 4f)
            reflectiveCurveTo(6.5f, 5.567f, 6.5f, 7.5f)
            reflectiveCurveTo(8.067f, 11f, 10f, 11f)
            curveToRelative(0.586f, 0f, 1.138f, -0.144f, 1.624f, -0.399f)
            curveToRelative(-0.234f, 0.868f, -0.564f, 1.595f, -0.959f, 2.175f)
            curveTo(9.875f, 13.938f, 8.84f, 14.5f, 7.75f, 14.5f)
            curveTo(7.336f, 14.5f, 7f, 14.836f, 7f, 15.25f)
            reflectiveCurveTo(7.336f, 16f, 7.75f, 16f)
            curveToRelative(1.671f, 0f, 3.137f, -0.883f, 4.156f, -2.38f)
            curveToRelative(1.01f, -1.486f, 1.594f, -3.583f, 1.594f, -6.12f)
            close()
        }
    }.build()
}
