package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Person32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Person32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 2f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
            moveToRelative(-6f, 7f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            close()
            moveToRelative(-2.5f, 9f)
            curveTo(5.567f, 18f, 4f, 19.567f, 4f, 21.5f)
            verticalLineToRelative(0.667f)
            curveTo(4f, 24.317f, 6.766f, 30f, 16f, 30f)
            reflectiveCurveToRelative(12f, -5.684f, 12f, -7.833f)
            verticalLineTo(21.5f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-17f)
            close()
            moveTo(5f, 21.5f)
            curveTo(5f, 20.12f, 6.12f, 19f, 7.5f, 19f)
            horizontalLineToRelative(17f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(0.667f)
            curveTo(27f, 23.684f, 24.765f, 29f, 16f, 29f)
            curveToRelative(-8.766f, 0f, -11f, -5.316f, -11f, -6.833f)
            verticalLineTo(21.5f)
            close()
        }
    }.build()
}
