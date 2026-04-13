package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ProhibitedMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ProhibitedMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.818f, 3.818f)
            curveToRelative(1.577f, -1.577f, 4.032f, -1.739f, 5.79f, -0.486f)
            lineTo(3.332f, 9.608f)
            curveToRelative(-1.253f, -1.758f, -1.09f, -4.213f, 0.486f, -5.79f)
            close()
            moveToRelative(0.574f, 6.85f)
            lineToRelative(6.276f, -6.276f)
            curveToRelative(1.253f, 1.758f, 1.09f, 4.213f, -0.486f, 5.79f)
            curveToRelative(-1.577f, 1.577f, -4.032f, 1.739f, -5.79f, 0.486f)
            close()
            moveToRelative(6.85f, -7.91f)
            curveTo(8.9f, 0.413f, 5.1f, 0.413f, 2.758f, 2.757f)
            curveToRelative(-2.343f, 2.343f, -2.343f, 6.141f, 0f, 8.485f)
            curveToRelative(2.344f, 2.343f, 6.142f, 2.343f, 8.486f, 0f)
            curveToRelative(2.343f, -2.344f, 2.343f, -6.143f, 0f, -8.486f)
            close()
            moveTo(14f, 7f)
            curveToRelative(0f, 3.866f, -3.134f, 7f, -7f, 7f)
            curveToRelative(-0.477f, 0f, -0.944f, -0.048f, -1.394f, -0.139f)
            curveToRelative(0.914f, 0.564f, 1.991f, 0.889f, 3.144f, 0.889f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            curveToRelative(0f, -1.153f, -0.325f, -2.23f, -0.889f, -3.144f)
            curveTo(13.952f, 6.056f, 14f, 6.523f, 14f, 7f)
            close()
        }
    }.build()
}
