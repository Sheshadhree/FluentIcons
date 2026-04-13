package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Compose24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Compose24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.25f, 4f)
            curveTo(13.664f, 4f, 14f, 4.336f, 14f, 4.75f)
            reflectiveCurveTo(13.664f, 5.5f, 13.25f, 5.5f)
            horizontalLineToRelative(-7f)
            curveTo(5.284f, 5.5f, 4.5f, 6.284f, 4.5f, 7.25f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(20f, 10.336f, 20f, 10.75f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(7.25f)
            curveTo(3f, 5.455f, 4.455f, 4f, 6.25f, 4f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(6.47f, -0.78f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineTo(10.59f, 14.47f)
            lineTo(9f, 15f)
            lineToRelative(0.53f, -1.59f)
            lineTo(19.72f, 3.22f)
            close()
        }
    }.build()
}
