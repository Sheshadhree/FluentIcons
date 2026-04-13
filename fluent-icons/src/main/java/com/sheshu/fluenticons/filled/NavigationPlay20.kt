package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NavigationPlay20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NavigationPlay20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 5f)
            curveTo(2.336f, 5f, 2f, 5.336f, 2f, 5.75f)
            reflectiveCurveTo(2.336f, 6.5f, 2.75f, 6.5f)
            horizontalLineToRelative(14.5f)
            curveTo(17.664f, 6.5f, 18f, 6.164f, 18f, 5.75f)
            reflectiveCurveTo(17.664f, 5f, 17.25f, 5f)
            horizontalLineTo(2.75f)
            close()
            moveTo(2f, 10.75f)
            curveTo(2f, 10.336f, 2.336f, 10f, 2.75f, 10f)
            horizontalLineToRelative(9.587f)
            curveToRelative(-0.572f, 0.403f, -1.065f, 0.913f, -1.447f, 1.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 11.5f, 2f, 11.164f, 2f, 10.75f)
            close()
            moveTo(2.75f, 15f)
            horizontalLineToRelative(7.272f)
            curveToRelative(0.048f, 0.525f, 0.169f, 1.028f, 0.353f, 1.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 16.5f, 2f, 16.164f, 2f, 15.75f)
            reflectiveCurveTo(2.336f, 15f, 2.75f, 15f)
            close()
            moveTo(20f, 14.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(11f, 16.985f, 11f, 14.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveToRelative(-2.287f, -0.437f)
            lineToRelative(-2.97f, -1.65f)
            curveTo(14.41f, 12.227f, 14f, 12.469f, 14f, 12.85f)
            verticalLineToRelative(3.3f)
            curveToRelative(0f, 0.382f, 0.41f, 0.623f, 0.743f, 0.437f)
            lineToRelative(2.97f, -1.65f)
            curveToRelative(0.343f, -0.19f, 0.343f, -0.684f, 0f, -0.874f)
            close()
        }
    }.build()
}
