package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ScreenSearch20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ScreenSearch20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineToRelative(10.5f)
            curveTo(16.769f, 4f, 18f, 5.231f, 18f, 6.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-5.129f)
            lineToRelative(-1f, -1f)
            horizontalLineToRelative(6.129f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-6.5f)
            curveTo(17f, 5.784f, 16.216f, 5f, 15.25f, 5f)
            horizontalLineTo(4.75f)
            curveTo(3.784f, 5f, 3f, 5.784f, 3f, 6.75f)
            verticalLineToRelative(1.506f)
            curveTo(2.644f, 8.382f, 2.308f, 8.551f, 2f, 8.758f)
            verticalLineTo(6.75f)
            close()
            moveTo(4.5f, 16f)
            curveToRelative(0.786f, 0f, 1.512f, -0.26f, 2.096f, -0.697f)
            lineToRelative(2.55f, 2.55f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.707f, 0f)
            curveToRelative(0.196f, -0.195f, 0.196f, -0.511f, 0f, -0.707f)
            lineToRelative(-2.55f, -2.55f)
            curveTo(7.741f, 14.012f, 8f, 13.286f, 8f, 12.5f)
            curveTo(8f, 10.567f, 6.433f, 9f, 4.5f, 9f)
            reflectiveCurveTo(1f, 10.567f, 1f, 12.5f)
            reflectiveCurveTo(2.567f, 16f, 4.5f, 16f)
            close()
            moveToRelative(0f, -1f)
            curveTo(3.12f, 15f, 2f, 13.88f, 2f, 12.5f)
            reflectiveCurveTo(3.12f, 10f, 4.5f, 10f)
            reflectiveCurveTo(7f, 11.12f, 7f, 12.5f)
            reflectiveCurveTo(5.88f, 15f, 4.5f, 15f)
            close()
        }
    }.build()
}
