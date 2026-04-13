package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextT12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextT12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 2.75f)
            curveTo(2f, 2.336f, 2.336f, 2f, 2.75f, 2f)
            horizontalLineToRelative(6f)
            curveTo(9.164f, 2f, 9.5f, 2.336f, 9.5f, 2.75f)
            verticalLineToRelative(1.5f)
            curveTo(9.5f, 4.664f, 9.164f, 5f, 8.75f, 5f)
            reflectiveCurveTo(8f, 4.664f, 8f, 4.25f)
            verticalLineTo(3.5f)
            horizontalLineTo(6.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(0.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(7.164f, 10f, 6.75f, 10f)
            horizontalLineToRelative(-2f)
            curveTo(4.336f, 10f, 4f, 9.664f, 4f, 9.25f)
            reflectiveCurveTo(4.336f, 8.5f, 4.75f, 8.5f)
            horizontalLineTo(5f)
            verticalLineToRelative(-5f)
            horizontalLineTo(3.5f)
            verticalLineToRelative(0.75f)
            curveTo(3.5f, 4.664f, 3.164f, 5f, 2.75f, 5f)
            reflectiveCurveTo(2f, 4.664f, 2f, 4.25f)
            verticalLineToRelative(-1.5f)
            close()
        }
    }.build()
}
