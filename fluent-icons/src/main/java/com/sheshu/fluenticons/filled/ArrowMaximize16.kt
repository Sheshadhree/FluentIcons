package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowMaximize16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowMaximize16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.75f, 2.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(5f)
            curveTo(13.5f, 8.664f, 13.164f, 9f, 12.75f, 9f)
            reflectiveCurveTo(12f, 8.664f, 12f, 8.25f)
            verticalLineTo(5.06f)
            lineTo(5.06f, 12f)
            horizontalLineToRelative(3.19f)
            curveTo(8.664f, 12f, 9f, 12.336f, 9f, 12.75f)
            reflectiveCurveTo(8.664f, 13.5f, 8.25f, 13.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-5f)
            curveTo(2.5f, 7.336f, 2.836f, 7f, 3.25f, 7f)
            reflectiveCurveTo(4f, 7.336f, 4f, 7.75f)
            verticalLineToRelative(3.19f)
            lineTo(10.94f, 4f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 4f, 7f, 3.664f, 7f, 3.25f)
            reflectiveCurveTo(7.336f, 2.5f, 7.75f, 2.5f)
            horizontalLineToRelative(5f)
            close()
        }
    }.build()
}
