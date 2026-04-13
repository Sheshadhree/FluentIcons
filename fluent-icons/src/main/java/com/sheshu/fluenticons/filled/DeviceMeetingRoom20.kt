package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DeviceMeetingRoom20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DeviceMeetingRoom20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.658f, 4.946f)
            curveTo(3.917f, 3.808f, 4.928f, 3f, 6.096f, 3f)
            horizontalLineToRelative(7.807f)
            curveToRelative(1.167f, 0f, 2.18f, 0.808f, 2.438f, 1.946f)
            lineToRelative(1.59f, 7f)
            curveTo(18.288f, 13.51f, 17.099f, 15f, 15.495f, 15f)
            horizontalLineTo(4.505f)
            curveToRelative(-1.604f, 0f, -2.793f, -1.49f, -2.438f, -3.054f)
            lineToRelative(1.591f, -7f)
            close()
            moveTo(5.5f, 16f)
            curveTo(5.223f, 16f, 5f, 16.224f, 5f, 16.5f)
            reflectiveCurveTo(5.223f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.775f, 16f, 14.5f, 16f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}
