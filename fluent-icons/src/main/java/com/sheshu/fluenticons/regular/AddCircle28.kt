package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AddCircle28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AddCircle28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2f)
            curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(2f, 20.627f, 2f, 14f)
            reflectiveCurveTo(7.373f, 2f, 14f, 2f)
            close()
            moveToRelative(0f, 1.5f)
            curveTo(8.201f, 3.5f, 3.5f, 8.201f, 3.5f, 14f)
            reflectiveCurveTo(8.201f, 24.5f, 14f, 24.5f)
            reflectiveCurveTo(24.5f, 19.799f, 24.5f, 14f)
            reflectiveCurveTo(19.799f, 3.5f, 14f, 3.5f)
            close()
            moveTo(14f, 8f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-4.5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(-4.5f)
            curveTo(8.336f, 14.75f, 8f, 14.414f, 8f, 14f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(4.5f)
            verticalLineToRelative(-4.5f)
            curveTo(13.25f, 8.336f, 13.586f, 8f, 14f, 8f)
            close()
        }
    }.build()
}
