package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowMinimizeVertical20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowMinimizeVertical20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.75f, 1.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(2.69f)
            lineToRelative(0.72f, -0.72f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineTo(9f, 4.94f)
            verticalLineTo(2.25f)
            curveTo(9f, 1.836f, 9.336f, 1.5f, 9.75f, 1.5f)
            close()
            moveTo(3.5f, 9.75f)
            curveTo(3.5f, 9.336f, 3.836f, 9f, 4.25f, 9f)
            horizontalLineToRelative(11f)
            curveTo(15.664f, 9f, 16f, 9.336f, 16f, 9.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-11f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
            moveToRelative(8.78f, 4.47f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineTo(9f, 14.56f)
            verticalLineToRelative(2.69f)
            curveTo(9f, 17.664f, 9.336f, 18f, 9.75f, 18f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-2.69f)
            lineToRelative(0.72f, 0.72f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            close()
        }
    }.build()
}
