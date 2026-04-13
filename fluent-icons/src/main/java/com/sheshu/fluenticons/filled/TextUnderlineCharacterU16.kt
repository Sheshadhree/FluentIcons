package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextUnderlineCharacterU16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextUnderlineCharacterU16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2.75f)
            curveTo(6f, 2.336f, 5.664f, 2f, 5.25f, 2f)
            reflectiveCurveTo(4.5f, 2.336f, 4.5f, 2.75f)
            verticalLineTo(7.5f)
            curveTo(4.5f, 9.433f, 6.067f, 11f, 8f, 11f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(2.75f)
            curveTo(11.5f, 2.336f, 11.164f, 2f, 10.75f, 2f)
            reflectiveCurveTo(10f, 2.336f, 10f, 2.75f)
            verticalLineTo(7.5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            verticalLineTo(2.75f)
            close()
            moveTo(4.75f, 12.5f)
            curveTo(4.336f, 12.5f, 4f, 12.836f, 4f, 13.25f)
            reflectiveCurveTo(4.336f, 14f, 4.75f, 14f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
