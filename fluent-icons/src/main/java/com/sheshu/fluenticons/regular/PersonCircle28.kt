package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonCircle28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonCircle28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 14f)
            curveTo(3.5f, 8.201f, 8.201f, 3.5f, 14f, 3.5f)
            reflectiveCurveTo(24.5f, 8.201f, 24.5f, 14f)
            reflectiveCurveTo(19.799f, 24.5f, 14f, 24.5f)
            reflectiveCurveTo(3.5f, 19.799f, 3.5f, 14f)
            close()
            moveTo(14f, 2f)
            curveTo(7.373f, 2f, 2f, 7.373f, 2f, 14f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(20.627f, 2f, 14f, 2f)
            close()
            moveToRelative(3.25f, 7.25f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            reflectiveCurveToRelative(-3.25f, -1.455f, -3.25f, -3.25f)
            reflectiveCurveTo(12.205f, 6f, 14f, 6f)
            reflectiveCurveToRelative(3.25f, 1.455f, 3.25f, 3.25f)
            close()
            moveTo(14f, 21.5f)
            curveToRelative(3.314f, 0f, 6f, -2.143f, 6f, -5.357f)
            curveTo(20f, 14.959f, 19.04f, 14f, 17.857f, 14f)
            horizontalLineToRelative(-7.714f)
            curveTo(8.959f, 14f, 8f, 14.96f, 8f, 16.143f)
            curveToRelative(0f, 3.214f, 2.686f, 5.357f, 6f, 5.357f)
            close()
        }
    }.build()
}
