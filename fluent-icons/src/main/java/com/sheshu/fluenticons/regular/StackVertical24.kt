package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.StackVertical24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StackVertical24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineTo(6.25f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            verticalLineToRelative(4f)
            curveTo(4.5f, 20.664f, 4.164f, 21f, 3.75f, 21f)
            reflectiveCurveTo(3f, 20.664f, 3f, 20.25f)
            verticalLineToRelative(-14f)
            close()
            moveToRelative(1.5f, 7.26f)
            curveTo(5.005f, 13.189f, 5.606f, 13f, 6.25f, 13f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.644f, 0f, 1.245f, 0.188f, 1.75f, 0.51f)
            verticalLineToRelative(-2.26f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineTo(6.25f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            verticalLineToRelative(2.26f)
            close()
            moveToRelative(15f, -7.26f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineToRelative(2.26f)
            curveTo(5.005f, 8.189f, 5.606f, 8f, 6.25f, 8f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.644f, 0f, 1.245f, 0.188f, 1.75f, 0.51f)
            verticalLineTo(6.25f)
            close()
        }
    }.build()
}
