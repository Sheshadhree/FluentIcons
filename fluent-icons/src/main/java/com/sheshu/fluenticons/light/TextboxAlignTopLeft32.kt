package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.TextboxAlignTopLeft32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.TextboxAlignTopLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.5f, 10f)
            horizontalLineToRelative(-15f)
            curveTo(8.224f, 10f, 8f, 9.776f, 8f, 9.5f)
            reflectiveCurveTo(8.224f, 9f, 8.5f, 9f)
            horizontalLineToRelative(15f)
            curveTo(23.776f, 9f, 24f, 9.224f, 24f, 9.5f)
            reflectiveCurveTo(23.776f, 10f, 23.5f, 10f)
            close()
            moveToRelative(-15f, 6f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(19.776f, 15f, 19.5f, 15f)
            horizontalLineToRelative(-11f)
            curveTo(8.224f, 15f, 8f, 15.224f, 8f, 15.5f)
            reflectiveCurveTo(8.224f, 16f, 8.5f, 16f)
            close()
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-17f)
            close()
            moveTo(7.5f, 4f)
            curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
            verticalLineToRelative(17f)
            curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
            horizontalLineToRelative(17f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-17f)
            curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
            horizontalLineToRelative(-17f)
            close()
        }
    }.build()
}
