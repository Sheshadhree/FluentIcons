package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ServiceBell20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ServiceBell20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            verticalLineToRelative(0.79f)
            curveToRelative(2.892f, 0.86f, 5f, 3.539f, 5f, 6.71f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 13f, 3f, 12.776f, 3f, 12.5f)
            curveToRelative(0f, -3.171f, 2.109f, -5.85f, 5f, -6.71f)
            verticalLineTo(5f)
            close()
            moveToRelative(2.5f, 3.5f)
            curveToRelative(0.422f, 0f, 0.84f, 0.004f, 1.268f, 0.158f)
            curveToRelative(0.413f, 0.148f, 0.87f, 0.452f, 1.316f, 1.12f)
            curveToRelative(0.153f, 0.23f, 0.464f, 0.291f, 0.693f, 0.138f)
            curveToRelative(0.23f, -0.153f, 0.292f, -0.464f, 0.139f, -0.693f)
            curveToRelative(-0.555f, -0.833f, -1.18f, -1.28f, -1.81f, -1.506f)
            curveTo(11.505f, 7.5f, 10.93f, 7.5f, 10.52f, 7.5f)
            horizontalLineTo(10.5f)
            curveTo(10.224f, 7.5f, 10f, 7.724f, 10f, 8f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            close()
            moveToRelative(-7f, 5.5f)
            curveTo(2.672f, 14f, 2f, 14.672f, 2f, 15.5f)
            reflectiveCurveTo(2.672f, 17f, 3.5f, 17f)
            horizontalLineToRelative(13f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(17.328f, 14f, 16.5f, 14f)
            horizontalLineToRelative(-13f)
            close()
        }
    }.build()
}
