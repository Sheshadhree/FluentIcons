package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PeopleCheckmark32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleCheckmark32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 16.5f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            close()
            moveToRelative(4.53f, 4.72f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-4.72f, 4.72f)
            lineToRelative(-1.97f, -1.97f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(5.25f, -5.25f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            close()
            moveTo(16f, 17f)
            curveToRelative(0.387f, 0f, 0.757f, 0.074f, 1.097f, 0.207f)
            curveTo(15.2f, 18.857f, 14f, 21.288f, 14f, 24f)
            curveToRelative(0f, 0.53f, 0.046f, 1.048f, 0.134f, 1.552f)
            curveTo(13.14f, 25.832f, 11.942f, 26f, 10.5f, 26f)
            curveTo(2.04f, 26f, 2f, 20.205f, 2f, 20.15f)
            verticalLineTo(20f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(11f)
            close()
            moveTo(10.5f, 4f)
            curveTo(13.538f, 4f, 16f, 6.462f, 16f, 9.5f)
            reflectiveCurveTo(13.538f, 15f, 10.5f, 15f)
            reflectiveCurveTo(5f, 12.538f, 5f, 9.5f)
            reflectiveCurveTo(7.462f, 4f, 10.5f, 4f)
            close()
            moveTo(23f, 7f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            close()
        }
    }.build()
}
