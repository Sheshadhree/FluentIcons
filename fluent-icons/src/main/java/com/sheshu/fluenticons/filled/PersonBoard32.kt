package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonBoard32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonBoard32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 3f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineToRelative(13f)
            curveTo(3f, 22.985f, 5.015f, 25f, 7.5f, 25f)
            horizontalLineToRelative(13f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-13f)
            curveTo(25f, 5.015f, 22.985f, 3f, 20.5f, 3f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(2.125f, 12f)
            horizontalLineToRelative(8.75f)
            curveToRelative(1.174f, 0f, 2.125f, 0.951f, 2.125f, 2.125f)
            curveToRelative(0f, 1.561f, -0.888f, 2.7f, -2.118f, 3.396f)
            curveTo(17.186f, 21.2f, 15.623f, 21.5f, 14f, 21.5f)
            curveToRelative(-1.623f, 0f, -3.186f, -0.3f, -4.382f, -0.979f)
            curveToRelative(-1.23f, -0.697f, -2.118f, -1.835f, -2.118f, -3.396f)
            curveTo(7.5f, 15.951f, 8.451f, 15f, 9.625f, 15f)
            close()
            moveTo(10.5f, 9.5f)
            curveTo(10.5f, 7.567f, 12.067f, 6f, 14f, 6f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveTo(15.933f, 13f, 14f, 13f)
            reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
            close()
            moveToRelative(0.5f, 19f)
            curveToRelative(-1.563f, 0f, -2.94f, -0.796f, -3.746f, -2.005f)
            curveToRelative(0.081f, 0.003f, 0.163f, 0.005f, 0.245f, 0.005f)
            horizontalLineToRelative(14f)
            curveToRelative(2.762f, 0f, 5f, -2.239f, 5f, -5f)
            verticalLineToRelative(-14f)
            curveToRelative(0f, -0.082f, -0.001f, -0.164f, -0.005f, -0.245f)
            curveTo(27.704f, 8.06f, 28.5f, 9.438f, 28.5f, 11f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 3.866f, -3.134f, 7f, -7f, 7f)
            horizontalLineTo(11f)
            close()
        }
    }.build()
}
