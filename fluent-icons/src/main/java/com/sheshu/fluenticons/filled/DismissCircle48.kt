package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DismissCircle48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DismissCircle48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 4f)
            curveToRelative(11.046f, 0f, 20f, 8.954f, 20f, 20f)
            reflectiveCurveToRelative(-8.954f, 20f, -20f, 20f)
            reflectiveCurveTo(4f, 35.046f, 4f, 24f)
            reflectiveCurveTo(12.954f, 4f, 24f, 4f)
            close()
            moveToRelative(-6.116f, 12.116f)
            lineToRelative(-0.102f, -0.091f)
            curveToRelative(-0.455f, -0.367f, -1.109f, -0.367f, -1.564f, 0f)
            lineToRelative(-0.102f, 0.091f)
            lineToRelative(-0.091f, 0.102f)
            curveToRelative(-0.367f, 0.455f, -0.367f, 1.109f, 0f, 1.564f)
            lineToRelative(0.091f, 0.102f)
            lineTo(22.233f, 24f)
            lineToRelative(-6.117f, 6.116f)
            lineToRelative(-0.091f, 0.102f)
            curveToRelative(-0.367f, 0.455f, -0.367f, 1.109f, 0f, 1.564f)
            lineToRelative(0.091f, 0.102f)
            lineToRelative(0.102f, 0.091f)
            curveToRelative(0.455f, 0.367f, 1.109f, 0.367f, 1.564f, 0f)
            lineToRelative(0.102f, -0.091f)
            lineTo(24f, 25.767f)
            lineToRelative(6.116f, 6.117f)
            lineToRelative(0.102f, 0.091f)
            curveToRelative(0.455f, 0.367f, 1.109f, 0.367f, 1.564f, 0f)
            lineToRelative(0.102f, -0.091f)
            lineToRelative(0.091f, -0.102f)
            curveToRelative(0.367f, -0.455f, 0.367f, -1.109f, 0f, -1.564f)
            lineToRelative(-0.091f, -0.102f)
            lineTo(25.767f, 24f)
            lineToRelative(6.117f, -6.116f)
            lineToRelative(0.091f, -0.102f)
            curveToRelative(0.367f, -0.455f, 0.367f, -1.109f, 0f, -1.564f)
            lineToRelative(-0.091f, -0.102f)
            lineToRelative(-0.102f, -0.091f)
            curveToRelative(-0.455f, -0.367f, -1.109f, -0.367f, -1.564f, 0f)
            lineToRelative(-0.102f, 0.091f)
            lineTo(24f, 22.233f)
            lineToRelative(-6.116f, -6.117f)
            lineToRelative(-0.102f, -0.091f)
            lineToRelative(0.102f, 0.091f)
            close()
        }
    }.build()
}
