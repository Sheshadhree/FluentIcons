package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Desk48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Desk48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.25f, 8f)
            curveTo(5.903f, 8f, 4f, 9.903f, 4f, 12.25f)
            verticalLineToRelative(21.5f)
            curveTo(4f, 37.202f, 6.798f, 40f, 10.25f, 40f)
            horizontalLineToRelative(7.5f)
            curveToRelative(3.452f, 0f, 6.25f, -2.798f, 6.25f, -6.25f)
            verticalLineTo(18.5f)
            horizontalLineToRelative(17.5f)
            verticalLineToRelative(20.25f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveTo(44f, 39.44f, 44f, 38.75f)
            verticalLineToRelative(-26.5f)
            curveTo(44f, 9.903f, 42.097f, 8f, 39.75f, 8f)
            horizontalLineTo(8.25f)
            close()
            moveTo(6.5f, 18.5f)
            horizontalLineToRelative(15f)
            verticalLineToRelative(15.25f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineToRelative(-7.5f)
            curveToRelative(-2.071f, 0f, -3.75f, -1.679f, -3.75f, -3.75f)
            verticalLineTo(18.5f)
            close()
            moveToRelative(0f, -2.5f)
            verticalLineToRelative(-3.75f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(31.5f)
            curveToRelative(0.967f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineTo(16f)
            horizontalLineToRelative(-35f)
            close()
            moveToRelative(4.75f, 7f)
            curveTo(10.56f, 23f, 10f, 23.56f, 10f, 24.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(17.44f, 23f, 16.75f, 23f)
            horizontalLineToRelative(-5.5f)
            close()
        }
    }.build()
}
