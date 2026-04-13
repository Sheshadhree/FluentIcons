package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCircleUp28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleUp28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.97f, 13.78f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(3.22f, -3.22f)
            verticalLineToRelative(8.69f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-8.69f)
            lineToRelative(3.22f, 3.22f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-4.5f, -4.5f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-4.5f, 4.5f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            close()
            moveTo(2f, 14f)
            curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(20.627f, 2f, 14f, 2f)
            reflectiveCurveTo(2f, 7.373f, 2f, 14f)
            close()
            moveToRelative(12f, 10.5f)
            curveTo(8.201f, 24.5f, 3.5f, 19.799f, 3.5f, 14f)
            reflectiveCurveTo(8.201f, 3.5f, 14f, 3.5f)
            reflectiveCurveTo(24.5f, 8.201f, 24.5f, 14f)
            reflectiveCurveTo(19.799f, 24.5f, 14f, 24.5f)
            close()
        }
    }.build()
}
