package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextUnderlineCharacterU16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextUnderlineCharacterU16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 2.5f)
            curveTo(5.5f, 2.224f, 5.276f, 2f, 5f, 2f)
            reflectiveCurveTo(4.5f, 2.224f, 4.5f, 2.5f)
            verticalLineToRelative(5f)
            curveTo(4.5f, 9.433f, 6.067f, 11f, 8f, 11f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-5f)
            curveTo(11.5f, 2.224f, 11.276f, 2f, 11f, 2f)
            reflectiveCurveToRelative(-0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(5f)
            curveTo(10.5f, 8.88f, 9.38f, 10f, 8f, 10f)
            reflectiveCurveTo(5.5f, 8.88f, 5.5f, 7.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(4.5f, 13f)
            curveTo(4.224f, 13f, 4f, 13.224f, 4f, 13.5f)
            reflectiveCurveTo(4.224f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 13f, 11.5f, 13f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
