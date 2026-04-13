package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextItalic20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextItalic20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3.25f)
            curveTo(8f, 2.836f, 8.336f, 2.5f, 8.75f, 2.5f)
            horizontalLineToRelative(7.5f)
            curveTo(16.664f, 2.5f, 17f, 2.836f, 17f, 3.25f)
            reflectiveCurveTo(16.664f, 4f, 16.25f, 4f)
            horizontalLineToRelative(-3.235f)
            lineTo(8.592f, 15.5f)
            horizontalLineToRelative(2.658f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(11.664f, 17f, 11.25f, 17f)
            horizontalLineToRelative(-7.5f)
            curveTo(3.336f, 17f, 3f, 16.664f, 3f, 16.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(3.235f)
            lineTo(11.408f, 4f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 4f, 8f, 3.664f, 8f, 3.25f)
            close()
        }
    }.build()
}
