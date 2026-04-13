package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Important20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Important20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3f)
            curveTo(8.895f, 3f, 8f, 3.895f, 8f, 5f)
            curveToRelative(0f, 2.065f, 0.746f, 4.915f, 1.184f, 6.403f)
            curveTo(9.288f, 11.756f, 9.617f, 12f, 10.001f, 12f)
            curveToRelative(0.384f, 0f, 0.712f, -0.243f, 0.816f, -0.595f)
            curveTo(11.255f, 9.925f, 12f, 7.09f, 12f, 5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
            moveTo(7f, 5f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            curveToRelative(0f, 2.25f, -0.788f, 5.214f, -1.224f, 6.69f)
            curveTo(11.54f, 12.481f, 10.81f, 13f, 10f, 13f)
            reflectiveCurveToRelative(-1.542f, -0.52f, -1.776f, -1.315f)
            curveTo(7.789f, 10.204f, 7f, 7.227f, 7f, 5f)
            close()
            moveToRelative(3f, 10f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(-2f, 1f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            close()
        }
    }.build()
}
