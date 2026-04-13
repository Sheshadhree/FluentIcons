package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cloud48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cloud48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 9f)
            curveToRelative(-6.29f, 0f, -11.45f, 4.84f, -11.959f, 11f)
            horizontalLineTo(11.5f)
            curveTo(6.806f, 20f, 3f, 23.806f, 3f, 28.5f)
            reflectiveCurveTo(6.806f, 37f, 11.5f, 37f)
            horizontalLineToRelative(25f)
            curveToRelative(4.694f, 0f, 8.5f, -3.806f, 8.5f, -8.5f)
            reflectiveCurveTo(41.194f, 20f, 36.5f, 20f)
            horizontalLineToRelative(-0.541f)
            curveTo(35.45f, 13.84f, 30.29f, 9f, 24f, 9f)
            close()
        }
    }.build()
}
