package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.People16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.People16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 9f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            curveToRelative(0f, 0.965f, -0.592f, 1.73f, -1.411f, 2.23f)
            curveTo(7.27f, 13.727f, 6.175f, 14f, 5f, 14f)
            reflectiveCurveToRelative(-2.27f, -0.272f, -3.089f, -0.77f)
            curveTo(1.091f, 12.73f, 0.5f, 11.964f, 0.5f, 11f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(5f)
            close()
            moveToRelative(6.653f, 0.008f)
            curveTo(14.91f, 9.085f, 15.5f, 9.723f, 15.5f, 10.5f)
            curveToRelative(0f, 0.771f, -0.47f, 1.409f, -1.102f, 1.83f)
            curveTo(13.763f, 12.754f, 12.913f, 13f, 12f, 13f)
            curveToRelative(-0.7f, 0f, -1.36f, -0.146f, -1.917f, -0.403f)
            curveToRelative(0.258f, -0.463f, 0.416f, -0.996f, 0.416f, -1.597f)
            curveToRelative(0f, -0.759f, -0.284f, -1.45f, -0.749f, -1.979f)
            curveTo(9.831f, 9.008f, 9.915f, 9f, 10f, 9f)
            horizontalLineToRelative(4f)
            lineToRelative(0.153f, 0.008f)
            close()
            moveTo(5f, 2.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveTo(6.519f, 8f, 5f, 8f)
            reflectiveCurveTo(2.25f, 6.769f, 2.25f, 5.25f)
            reflectiveCurveTo(3.481f, 2.5f, 5f, 2.5f)
            close()
            moveToRelative(7.002f, 0.997f)
            curveToRelative(1.243f, 0f, 2.252f, 1.008f, 2.252f, 2.251f)
            curveTo(14.254f, 6.992f, 13.245f, 8f, 12.002f, 8f)
            curveTo(10.758f, 8f, 9.75f, 6.992f, 9.75f, 5.748f)
            curveToRelative(0f, -1.243f, 1.008f, -2.25f, 2.252f, -2.25f)
            close()
        }
    }.build()
}
